package objects;

public class Account {
    String accountName;
    String webSite;
    String industryType;
    String description;
    String billingAddress;

    public Account(String accountName, String webSite, String industryType) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.industryType = industryType;
        this.description = description;
        this.billingAddress = billingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getDescription() {
        return description;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }
}

