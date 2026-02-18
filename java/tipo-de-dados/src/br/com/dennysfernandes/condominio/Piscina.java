package br.com.dennysfernandes.condominio;

class Piscina {
 private String boia;

 //getters e setters
 public String getBoia() {
  registrarEmprestimo();
  return boia;
 }

 public void setBoia(String boia) {
  //Verificar se a boia não está furada
  this.boia = boia;
 }

 private void registrarEmprestimo() {

 }
}
