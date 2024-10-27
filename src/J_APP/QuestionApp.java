package J_APP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionApp {
    private List<Question> questions;
    private int currentQuestionIndex = 0;

    public QuestionApp() {
        this.questions = new ArrayList<>();
        loadQuestionsFromFile(); // Load questions from file
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Java Interview Q&A App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Custom background panel with watermark
        WatermarkPanel watermarkPanel = new WatermarkPanel();

        JLabel questionLabel = new JLabel();
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        questionLabel.setVerticalAlignment(SwingConstants.CENTER);
        updateQuestionLabel(questionLabel);

        JButton nextQuestionButton = new JButton("Next Question");
        JButton showAnswerButton = new JButton("Show Answer");

        // Show next question
        nextQuestionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentQuestionIndex++;
                if (currentQuestionIndex >= questions.size()) {
                    currentQuestionIndex = 0; // Go back to the first question
                }
                updateQuestionLabel(questionLabel);
            }
        });

        // Show answer for the current question
        showAnswerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Question currentQuestion = questions.get(currentQuestionIndex);
                JOptionPane.showMessageDialog(frame, currentQuestion.getAnswer(), "Answer", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(nextQuestionButton);
        buttonPanel.add(showAnswerButton);

        watermarkPanel.setLayout(new BorderLayout());
        watermarkPanel.add(questionLabel, BorderLayout.CENTER);
        watermarkPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(watermarkPanel); // Add watermark panel to frame
        frame.setVisible(true);
    }

    private void updateQuestionLabel(JLabel questionLabel) {
        if (questions.isEmpty()) {
            questionLabel.setText("No questions available.");
        } else {
            Question currentQuestion = questions.get(currentQuestionIndex);
            questionLabel.setText("<html><body style='text-align: center'>" + currentQuestion.getQuestionText() + "</body></html>");
        }
    }

    private void loadQuestionsFromFile() {
        String filePath = "src/J_APP/questions.txt"; // Adjusted to match the directory structure
        File file = new File(filePath);

        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "The file 'questions.txt' was not found in the src folder. Please ensure it is in the correct directory.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String questionText = parts[1];
                    String answer = parts[2];
                    questions.add(new Question(id, questionText, answer));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to load questions from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuestionApp());
    }

    // Inner class to create watermark effect
    private static class WatermarkPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setFont(new Font("Arial", Font.BOLD, 48));
            g2d.setColor(new Color(200, 200, 200, 50)); // Light gray, semi-transparent

            // Draw watermark text in the background
            String watermarkText = "HIDIR";
            FontMetrics fm = g2d.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(watermarkText)) / 2;
            int y = (getHeight() / 2) + (fm.getAscent() / 2);
            g2d.drawString(watermarkText, x, y);
        }
    }
}
