package pairmatching.common;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import pairmatching.common.enums.FilePath;

public class FileReaderTest {
    @Test
    public void 백엔드_크루_이름_파일을_제대로_읽어온다() {
        List<String> names = FileReader.readFile(FilePath.BACKEND);
        List<String> backendCrews = Arrays.asList(
                "백호", "태웅", "치수", "태섭", "대만",
                "준호", "대협", "덕규", "태산", "경태",
                "수겸", "현준", "준섭", "한나", "소연",
                "호열", "대남", "용팔", "구식", "달재"
        );
        assertThat(names).isEqualTo(backendCrews);
    }

    @Test
    public void 프론트엔드_크루_이름_파일을_제대로_읽어온다() {
        List<String> names = FileReader.readFile(FilePath.FRONTEND);
        List<String> frontendCrews = Arrays.asList(
                "보노", "시저", "쉐리", "신디", "다비",
                "덴버", "이브", "제시", "라라", "린다",
                "리사", "니콜", "로드", "윌터", "제키"
        );
        assertThat(names).isEqualTo(frontendCrews);
    }
}
