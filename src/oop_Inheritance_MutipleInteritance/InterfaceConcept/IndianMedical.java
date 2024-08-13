package oop_Inheritance_MutipleInteritance.InterfaceConcept;

public interface IndianMedical extends WHO
{
  public void oncologyServices();
  public void neuroServices();
  public void emergencyServices();////commonly added in all 3 interface but need to override onces

}
