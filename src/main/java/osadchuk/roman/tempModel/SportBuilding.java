package osadchuk.roman.tempModel;



public class SportBuilding {

  private long id;
  private String name;
  private long typeOfSportBuildingId;
  private String phone;
  private String address;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getTypeOfSportBuildingId() {
    return typeOfSportBuildingId;
  }

  public void setTypeOfSportBuildingId(long typeOfSportBuildingId) {
    this.typeOfSportBuildingId = typeOfSportBuildingId;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}