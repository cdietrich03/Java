package week4;

public class VotingTest {
    public static void main(String[] args) {
        VotingMachine poll = new VotingMachine("Pollution", 0, 0);
        poll.voteYes();
        poll.voteYes();
        poll.voteNo();
        System.out.println(poll);
        poll.clearMachine();
        System.out.println(poll);
    }
}
