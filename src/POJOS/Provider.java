package POJOS;
import java.io.Serializable;
import java.util.Objects;
import java.util.TreeSet;

public class Provider implements Serializable{
	private Integer providerInt;
    private String providerPassword;
    private String providerUsername;
    private String enterprise_Name;
    private String country;
    private String contact_Number;
    private String adress;
    private TreeSet<Piece> pieces;

    public Provider(Integer providerInt, String providerPassword, String providerUsername, String enterprise_Name, String country, String contact_Number, String adress) {
        this.providerInt = providerInt;
        this.providerPassword = providerPassword;
        this.providerUsername = providerUsername;
        this.enterprise_Name = enterprise_Name;
        this.country = country;
        this.contact_Number = contact_Number;
        this.adress = adress;
        this.pieces=new TreeSet<>();
    }

    public void addPieces(Piece piece){
        pieces.add(piece);
    }
    public int getProviderInt() {
        return providerInt;
    }

    public void setProviderInt(int providerInt) {
        this.providerInt = providerInt;
    }

    public String getProviderPassword() {
        return providerPassword;
    }

    public void setProviderPassword(String providerPassword) {
        this.providerPassword = providerPassword;
    }

    public String getProviderUsername() {
        return providerUsername;
    }

    public void setProviderUsername(String providerUsername) {
        this.providerUsername = providerUsername;
    }

    public String getEnterprise_Name() {
        return enterprise_Name;
    }

    public void setEnterprise_Name(String enterprise_Name) {
        this.enterprise_Name = enterprise_Name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContact_Number() {
        return contact_Number;
    }

    public void setContact_Number(String contact_Number) {
        this.contact_Number = contact_Number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return Objects.equals(providerInt, provider.providerInt) && Objects.equals(providerPassword, provider.providerPassword) && Objects.equals(providerUsername, provider.providerUsername) && Objects.equals(enterprise_Name, provider.enterprise_Name) && Objects.equals(country, provider.country) && Objects.equals(contact_Number, provider.contact_Number) && Objects.equals(adress, provider.adress) && Objects.equals(pieces, provider.pieces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerInt, providerPassword, providerUsername, enterprise_Name, country, contact_Number, adress, pieces);
    }
}
