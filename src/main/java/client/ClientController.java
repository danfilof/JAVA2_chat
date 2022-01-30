package client;

import java.awt.*;

public class ClientController {

    private TextArea messageArea;

    private TextField messageField;

    public ClientController() {
        new ChatClient(this);
    }

    public void onClickSendButton(ActiveEvent actionEvent) {
        final String answer = messageField.getText();
        if (answer != null && !answer.isEmpty()) {
            messageArea.appendText(answer + "\nj");
            messageField.clear();
            messageField.requestFocus();
        }
    }

    public void addMessage(String message) {
        messageArea.appendText(message + "\n");
    }
}
