public class Squad{
    private  String mDescription;
    private String msquadId;
    private String mMax;
    private String mName;
    private String mStrength;
    private String mWeakness;
    private String mheroname;

    public Squad(String name, String squadId,String max, String strength, String heroname){
        msquadId = squadId;
        mMax=max;
        mDescription=name;
        mStrength=strength;
        mheroname=heroname;

    }

    public String getDescription() {
        return mDescription;
    }

    public String getheroname() {
        return mheroname;
    }

    public String getsquadId() {
        return msquadId;
    }


    public String getStrength() {
        return mStrength;

    }

}