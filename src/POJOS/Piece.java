package POJOS;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import Enums.AccessoryType;

public class Piece implements Serializable{
	 private Integer accesoryId;
	    private LocalDate last_Maintainance_Date;
	    private LocalDate next_Maintainance_Date;
	    private String material;
	    private AccessoryType accesoryType;
	    private Integer lifeSpan;

	    public Piece(Integer accesoryId, LocalDate last_Maintainance_Date, LocalDate next_Maintainance_Date, String material, AccesoryType accesoryType, Integer lifeSpan) {
	        this.accesoryId = accesoryId;
	        this.last_Maintainance_Date = last_Maintainance_Date;
	        this.next_Maintainance_Date = next_Maintainance_Date;
	        this.material = material;
	        this.accesoryType = accesoryType;
	        this.lifeSpan = lifeSpan;
	    }

	    public AccessoryType getAccesoryType() {
	        return accesoryType;
	    }

	    public void setAccesoryType(AccessoryType accesoryType) {
	        this.accesoryType = accesoryType;
	    }

	    public Integer getLifeSpan() {
	        return lifeSpan;
	    }

	    public void setLifeSpan(Integer lifeSpan) {
	        this.lifeSpan = lifeSpan;
	    }

	    public int getAccesoryId() {
	        return accesoryId;
	    }

	    public void setAccesoryId(Integer accesoryId) {
	        this.accesoryId = accesoryId;
	    }


	    public LocalDate getLast_Maintainance_Date() {
	        return last_Maintainance_Date;
	    }

	    public void setLast_Maintainance_Date(LocalDate last_Maintainance_Date) {
	        this.last_Maintainance_Date = last_Maintainance_Date;
	    }

	    public LocalDate getNext_Maintainance_Date() {
	        return next_Maintainance_Date;
	    }

	    public void setNext_Maintainance_Date(LocalDate next_Maintainance_Date) {
	        this.next_Maintainance_Date = next_Maintainance_Date;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Piece pieces = (Piece) o;
	        return Objects.equals(accesoryId, pieces.accesoryId) && Objects.equals(last_Maintainance_Date, pieces.last_Maintainance_Date) && Objects.equals(next_Maintainance_Date, pieces.next_Maintainance_Date) && Objects.equals(material, pieces.material) && accesoryType == pieces.accesoryType && Objects.equals(lifeSpan, pieces.lifeSpan);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(accesoryId, last_Maintainance_Date, next_Maintainance_Date, material, accesoryType, lifeSpan);
	    }
}
