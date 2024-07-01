package SystemFra;

public class Branch {
    private String branchId;
    private String branchName;
    private String branchAddress;
    private String cityId;

    public Branch(String branchId, String branchName, String branchAddress, String cityId) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.cityId = cityId;
    }


    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }
    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getCityId() {
        return cityId;
    }
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}

