package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class Game {

    public static final int MANUFACTURED_CARS = 20;

    /** Container of Cars */
    private Car[] cars;

    /** Animation delay */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;
    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);
    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);
        }
    }

    // ask cars to move and check for collision
    private void moveAllCars() {

        // iterate through all cars
        for (int i = 0; i < cars.length; i++) {

            // check position to crash the cars
            for (int j = 0; j < cars.length; j++) {

                // this corrects the car color - otherwise they are all red
                if (i == j) {
                    continue;
                }

                // checks if the position between each car is the same, if true there's a crash
                if (cars[i].getPos().checkPosition(cars[j].getPos())) {
                    cars[i].crashed();
                    cars[j].crashed();
                }
            }

            // make the cars move
            cars[i].moveCar();
        }
    }
}
