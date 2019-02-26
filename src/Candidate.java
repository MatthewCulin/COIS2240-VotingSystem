public class Candidate
{
    private String candidateName;
    private String candidateBiography;

    ////////////////////////////////////////////////////////////
    // Returns candidates name
    public String getCandidateName()
    {
        return candidateName;
    }// END OF GET CANDIDATE NAME


    ////////////////////////////////////////////////////////////
    // Returns candidates biography
    public String getCandidateBiography()
    {
        return candidateBiography;
    }// END OF GET CANDIDATE BIOGRAPHY


    ////////////////////////////////////////////////////////////
    // Creates a default object of type candidate
    public Candidate()
    {
        this.candidateName = "NO CANDIDATE";
        this.candidateBiography = "NO BIOGRAPHY AVAILABLE";
    }// END OF CANDIDATE


    ////////////////////////////////////////////////////////////
    // Creates an object of type candidate
    public Candidate(String candidateName, String candidateBiography)
    {
        this.candidateName = candidateName;
        this.candidateBiography = candidateBiography;
    }// END OF CANDIDATE


}// END OF CANDIDATE CLASS
