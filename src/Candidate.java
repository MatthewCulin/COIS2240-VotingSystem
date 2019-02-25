public class Candidate
{
    private String candidateName;
    private String candidateBiography;

    public Candidate()
    {
        this.candidateName = "Candidate";
        this.candidateBiography = "No biography available for this candidate";
    }

    public Candidate(String candidateName, String candidateBiography)
    {
        this.candidateName = candidateName;
        this.candidateBiography = candidateBiography;
    }


}// END OF CANDIDATE CLASS
