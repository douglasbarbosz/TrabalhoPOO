//Nome: Douglas Aparecido Barbosa RA:2268639

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
	
    public Cliente() {}
        
    public Cliente(String name, String email, Date dataNascimento) {
        if (dataNascimento.after(Calendar.getInstance().getTime())) {
            throw new IllegalArgumentException("A Data de nascimento não pode ser no futuro.");
        }
        this.nome = name;
        this.email = email;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}