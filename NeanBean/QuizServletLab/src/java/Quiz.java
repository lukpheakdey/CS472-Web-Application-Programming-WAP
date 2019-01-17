/**
 * @author lukpheakdey
 */

public class Quiz {
    private String[] questions = {
        "3, 1, 4, 1, 5",
        "1, 1, 2, 3, 5",
        "1, 4, 9, 16, 25",
        "2, 3, 5 ,7, 11",
        "1, 2, 4, 8, 16"
    };
    
    private int[] answers = {9, 8, 36, 13, 32};
    private int currentQuiz;
    private int currentPoint;
    
    public Quiz(){
        this.currentQuiz = 0;
        this.currentPoint = 0;
    }
    
    public String[] getQuestions() {
        return questions;
    }
    
    public int[] getAnswers() {
        return answers;
    }

    public int getCurrentQuiz() {
        return currentQuiz;
    }

    public int getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentQuiz(int currentQuiz) {
        this.currentQuiz = currentQuiz;
    }

    public void setCurrentPoint(int currentPoint) {
        this.currentPoint = currentPoint;
    }
    
    
    public void checkAnswer(int answer){
        if(answers[currentQuiz] == answer){
            currentPoint++;
        }
        currentQuiz++;
    }
    
}
