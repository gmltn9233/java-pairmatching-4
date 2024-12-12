package pairmatching.common.enums;

public enum FilePath {

    // 혹은 절대 경로 사용
    BACKEND("src/main/resources/backend-crew.md"),
    FRONTEND("src/main/resources/frontend-crew.md");

    private final String filePath;

    FilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
