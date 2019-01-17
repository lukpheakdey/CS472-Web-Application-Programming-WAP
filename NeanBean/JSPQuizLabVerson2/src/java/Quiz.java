/**
 * @author lukpheakdey
 */
import java.util.*;
import java.util.Iterator;

public class Quiz {
    
    private final String[] questions = { 
        "3, 1, 4, 1, 5",
        "1, 1, 2, 3, 5",
        "1, 4, 9, 16, 25",
        "2, 3, 5, 7, 11",
        "1, 2, 4, 8, 16"
    };
    
    private final Integer[] answers = {9, 8, 36, 13, 32};
    
    private final String[] hints = {
        "PI",
        "Fibonacci",
        "Squares",
        "Primes",
        "Power of 2"
    };
    
    private Iterator questionIterator = null;
    private Iterator answerIterator = null;
    private Iterator hintIterator = null;
    
    public Quiz(){
        questionIterator = Arrays.asList(questions).iterator();
        answerIterator = Arrays.asList(answers).iterator();
        hintIterator = Arrays.asList(hints).iterator();
    }
    
    public boolean hasQuestion(){
        return questionIterator.hasNext();
    }
    
    public String getNextQuestion(){
        if(hasQuestion()){
            return (String)questionIterator.next();
        }
        return null;
    }
    
    public boolean hasAnswer(){
        return answerIterator.hasNext();
    }
    
    public Integer getAnswer(){
        if(answerIterator.hasNext()){
            return (Integer)answerIterator.next();
        }
        return null;
    }
    
    public boolean hasHint(){
        return hintIterator.hasNext();
    }
    
    public String getHint(){
        if(hasHint())
            return (String)hintIterator.next();
        return "";
    }
    
    public boolean check(int answer, int guess){
        return hasAnswer() && guess==answer;
    }
    
}
