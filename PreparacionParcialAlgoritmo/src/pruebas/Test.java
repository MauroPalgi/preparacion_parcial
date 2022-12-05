/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author mauro
 */
public class Test implements Comparable<Test> {

  static private int idGlobal = 0;
    private int id;
    private String comment = "mauro";

    public Test() {
        this.id = Test.idGlobal;
        Test.idGlobal++;
    }

    public Test(String comment) {
        this.id = Test.idGlobal;
        this.comment = comment;
        Test.idGlobal++;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Test other = (Test) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Test{" + "id=" + id + ", comment=" + comment + "}";
    }

    @Override
    public int compareTo(Test o) {        
        // 1 - 2 =  -1 -> soy menor
        // 1 - 0 = 1 -> soy mayor
        return this.id - o.id;

    }
    
}
