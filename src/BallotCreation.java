import java.util.Scanner;

public class BallotCreation extends VotePersonalIdentification
{
    private String ballotName;
    private Candidate[] candidates = new Candidate[5];

    ////////////////////////////////////////////////////////////
    // Creates a ballot with the voterID associated to it
    public BallotCreation(String voterID)
    {
        this.ballotName = voterID;
    }// END OF BALLOT CREATION


    ////////////////////////////////////////////////////////////
    // Allows the voter to submit a ballot
    public String submitBallot()
    {
        String vote;
        Scanner scan = new Scanner(System.in);

        // Candidate list
        candidates[0] = new Candidate("Joe", ": I'm a thief");
        candidates[1] = new Candidate("Jane", ": I'm a crook");
        candidates[2] = new Candidate("John", ": I'm reliable");
        candidates[3] = new Candidate("Jan", ": I'm more reliable");
        candidates[4] = new Candidate("Jason", ": I don't want to run");

        displayBallot();
        System.out.print("\nWhich candidate would you like to vote for?: ");
        vote = scan.next().toUpperCase();

        //////////////////////////////
        // Switch statement determines which candidate has been voted for
        switch(vote)
        {
            case "JOE":
                System.out.println("\n" + ballotName + " voted for " + candidates[0].getCandidateName() + ".");
                break;

            case "JANE":
                System.out.println("\n" + ballotName + " voted for " + candidates[1].getCandidateName() + ".");
                break;

            case "JOHN":
                System.out.println("\n" + ballotName + " voted for " + candidates[2].getCandidateName() + ".");
                break;

            case "JAN":
                System.out.println("\n" + ballotName + " voted for " + candidates[3].getCandidateName() + ".");
                break;

            case "JASON":
                System.out.println("\n" + ballotName + " voted for " + candidates[4].getCandidateName() + ".");
                break;

            default:
                System.out.println("\n" + ballotName + " did not vote.");
                break;
        }

        return vote;
    }// END OF SUBMIT BALLOT


    ////////////////////////////////////////////////////////////
    // Displays the candidates that can be voted for
    public void displayBallot()
    {
        System.out.println("\n" + ballotName);
        System.out.println("CANDIDATE: BIOGRAPHY");

        for(int i = 0; i < candidates.length; i++)
            System.out.println(candidates[i].getCandidateName() + candidates[i].getCandidateBiography());

    }// END OF DISPLAY BALLOT

}// END OF BALLOT CREATION CLASS
