import java.util.Scanner;

public class BallotCreation extends VotePersonalIdentification
{
    private String ballotName;
    private Candidate[] candidates = new Candidate[10];

    public void displayBallot(String ballotName, Candidate[] candidates)
    {
        System.out.println(ballotName);

        for(int i = 0; i < candidates.length; i++)
            System.out.println(candidates[i]);

    }// END OF DISPLAY BALLOT

    public String submitBallot()
    {
        String vote;
        Scanner scan = new Scanner(System.in);

        System.out.println("Which candidate would you like to vote for?: ");
        vote = scan.next();

        return vote;
    }// END OF SUBMIT BALLOT

}// END OF BALLOT CREATION CLASS
