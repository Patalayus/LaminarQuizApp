package laminarsoftworks.laminarquiz;

public class Questions {

    public String mQuestions[] = {
            "In CS, what is the word for an 8-bit binary value divided by two?",
            "In biology what is the powerhouse of the cell?",
            "What does DNA stand for?",
            "In CS, what is the word for an 8-bit binary value divided by two?3",
            "In CS, what is the word for an 8-bit binary value divided by two?4",
            "In CS, what is the word for an 8-bit binary value divided by two?5",
            "In CS, what is the word for an 8-bit binary value divided by two?6",
            "In CS, what is the word for an 8-bit binary value divided by two?7",
            "In CS, what is the word for an 8-bit binary value divided by two?8"

    };

    private String mChoices[][] = {
            {"A Bit", "A Nibble", "A Float Point", "4-Bit"},
            {"The Nucleus", "The Mitochondria", "The Cell Membrane", "The Cell Wall"},
            {"Detoxin Notrious Anaxyis", "Decrypt of Notrosic Alias", "Deoxyribonucleic Acid", "Description of Neural Analytics"},
            {"Jupiter", "Saturn", "Mars", "Earth"},
            {"Jupiter", "Pluto", "Mercury", "Earth"},
            {"Uranus", "Venus", "Mars", "Saturn"},
            {"Saturn", "Pluto", "Uranus", "Earth"},
            {"Venus", "Neptune", "Pluto", "Mars"},
            {"Mercury", "Venus", "Mars", "Pluto"}
    };

    private String mCorrectAnswers[]= {"A Nibble", "The Mitochondria", "Deoxyribonucleic Acid", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
