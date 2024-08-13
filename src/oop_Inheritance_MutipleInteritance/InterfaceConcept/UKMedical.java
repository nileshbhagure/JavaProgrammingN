package oop_Inheritance_MutipleInteritance.InterfaceConcept;

public interface UKMedical extends WHO
{
 public void ENTServices();
 public void cardioServices();
 public void emergencyServices();//commonly added in all 3 interface but need to override onces
 public void test();
}
