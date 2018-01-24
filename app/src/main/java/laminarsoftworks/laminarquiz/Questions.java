package laminarsoftworks.laminarquiz;

public class Questions {

    public String mQuestions[] = {
            "In CS, what is the word for an 8-bit binary value divided by two?",
            "In biology, what is the powerhouse of the cell?",
            "In biology, What does DNA stand for?",
            "In physics, what is Newton's second law?",
            "In art, who painted the Mona Lisa?",
            "In biology, who invented penicillin?",
            "In physics, what is the most ionising electromagnetic wave?",
            "In math, what is pythagoras' theorem?",
            "In english, which one is an oxymoron?"

    };

    private String mChoices[][] = {
            {"A Bit", "A Nibble", "A Float Point", "4-Bit"},
            {"The Nucleus", "The Mitochondria", "The Cell Membrane", "The Cell Wall"},
            {"Detoxin Notrious Anaxyis", "Decrypt of Notrosic Alias", "Deoxyribonucleic Acid", "Description of Neural Analytics"},
            {"F=MxV", "F=MxA", "P=MxV", "S=D/T"},
            {"Van Gogh", "Leonardo da Vinci", "Claude Monet", "Banksy"},
            {"Frank Nightingale", "Charles Darwin", "Albert Einstein", "Alexander Flemming"},
            {"Alpha", "Beta", "Gamma", "Theta"},
            {"E=MC^2", "V=I*R", "2πr", "a^2+b^2=c^2"},
            {"Aftertaste", "All for One", "Bitter Sweet", "Lost & Found"}
    };

    private String mCorrectAnswers[]= {"A Nibble", "The Mitochondria", "Deoxyribonucleic Acid", "F=MxA", "Leonardo da Vinci", "Alexander Flemming", "Gamma", "a^2+b^2=c^2", "Bitter Sweet"};

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
