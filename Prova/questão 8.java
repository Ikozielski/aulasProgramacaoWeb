
private String nome;
private String login;
private String senha;


public Login (){
	
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String string) {
	this.senha = string;
} 
 
 
 

  public class Crud	{
  
                  public	Crudpw() {
                          this.create	=	new	criar().getSession();
                  }
                  public	Crud	CrudLoginSenha(Crud	Crud) {      //A concluir...
                         

                          return	(Crud)	query.uniqueResult();
                  }
          }


<html>
				<body>
								<h2>Login	no	create </h2>
								<form	action="Login">
												Login:	<input	type="text" name="login"	/><br	/>
												Senha:	<input	type="password" name="senha"	/>  //A concluir...

								</form>
				</body

        