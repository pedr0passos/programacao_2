package lista_avaliativa.q03;

public class Login {

    private String usuario;
    private String senha;

    public Login (String usuario, String senha ) {
        this.usuario = usuario;
        this.senha = senha;
    }        

    public void setSenha ( String senha ) {
        this.senha = senha;
    }

    public boolean fazerLogin (String usuario, String senha ) {
        try {
            if ( this.usuario.equals(usuario) && this.senha.equals(senha) ) {
                return true;
            } else if ( !this.usuario.equals(usuario) ) {
                throw new Exception("Usuario Incorreto");
            } else if ( !this.senha.equals(senha) ) {
                throw new Exception("Senha Incorreta");
            }
        } catch ( Exception e ) {
            System.out.println("Erro!");
        }
        return false;
    }

}
