
import com.company.Account;
import com.company.PublicDigitalBank;
import com.company.UserAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PublicDigtalBankTest {

    PublicDigitalBank bank;
    @BeforeEach
    public void setup(){
       bank = new PublicDigitalBank("Dagobert", "McDuck INC.");
       Account account = new UserAccount("Kis József", "password");
       bank.register(account);
    }

    @Test
    public void authenticateTest(){
        Assertions.assertEquals(bank.authernticate("Kis József", "password"), true);
    }


}
