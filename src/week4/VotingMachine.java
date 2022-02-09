package week4;

public class VotingMachine {
    private int numberYesVotes;
    private int numberNoVotes;
    private String name;

    public VotingMachine(String name, int numberNoVotes, int numberYesVotes) {
        this.name = name;
        this.numberNoVotes = numberNoVotes;
        this.numberYesVotes = numberYesVotes;
    }

    public void voteYes() {
        numberYesVotes++;
    }

    public void voteNo() {
        numberNoVotes++;
    }

    public int returnYesCount() {
        return numberYesVotes;
    }

    public int returnNoCount() {
        return numberNoVotes;
    }

    public void clearMachine() {
        numberNoVotes = 0;
        numberYesVotes = 0;
    }

    public String toString() {
        String out = "Yes count = " + numberYesVotes + " and No count = " + numberNoVotes;
        return out;
    }
}
