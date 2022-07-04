import java.util.Date;

public class Name {
    //variáveis que falam por si só
    //A
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user){};

    //Declarações corretas
    //A
    public List<Account> AccountList;

    //B
    public void deleteUser(Name.User user){};

    // Evite mapa mental
    //B
    public URL url;

    // Classe possui nomes próprios, funções devem ter verbos
    //A
    public class TableRepresent {};
    public void saveCar(){};

    // Uma palavra por conceito
    //B
    public saveUser(){}; createAccount(){}; generateContract(){};


    //Use constants, enums instead of magic numbers, abbreviations
    public final int DAYS_IN_YEAR = 360;
    public final int HOURS_IN_WEEK = 168;
}
