package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {
    private final Car car = new Car("abc");

    @Test
    void moveFowrard_자동차_전진() {
        int pre = car.getMoveIndex();
        car.moveFowrard();

        assertThat(car.getMoveIndex()).isEqualTo(pre + 1);
    }

    @Test
    void stop_자동차_멈춤() {
        int pre = car.getMoveIndex();
        car.stop();

        assertThat(car.getMoveIndex()).isEqualTo(pre);
    }
}
