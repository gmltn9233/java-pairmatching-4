package pairmatching.view;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OutputViewTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
        output.reset();
    }

    @Test
    void 과정_미션_출력() {
        String lineSeparator = System.lineSeparator(); // 플랫폼에 맞는 줄바꿈 문자
        String expectedOutput = "#############################################" + lineSeparator
                + "과정: 백엔드 | 프론트엔드" + lineSeparator
                + "미션:" + lineSeparator
                + "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임" + lineSeparator
                + "  - 레벨2: 장바구니 | 결제 | 지하철노선도" + lineSeparator
                + "  - 레벨3: " + lineSeparator
                + "  - 레벨4: 성능개선 | 배포" + lineSeparator
                + "  - 레벨5: " + lineSeparator
                + "#############################################" + lineSeparator;

        OutputView.printCourseAndMissions();

        assertThat(output.toString()).isEqualTo(expectedOutput.trim());
    }
}

