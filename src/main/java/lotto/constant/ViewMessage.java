package lotto.constant;

public enum ViewMessage {
    INPUT_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    INPUT_WINNING_NUMBERS("당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER("보너스 번호를 입력해 주세요.");

    private final String text;

    ViewMessage(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
