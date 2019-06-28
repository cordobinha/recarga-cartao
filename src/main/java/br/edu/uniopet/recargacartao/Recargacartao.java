package br.edu.uniopet.recargacartao;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Recargacartao {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Integer id;

       private String numerocartao;

       private String nomecartao;

       private String datacartao;

       private String cartaoccv;

       private Double saldo;


       public Recargacartao() {

       }


       public Recargacartao(Integer id, String numerocartao, String nomecartao, String datacartao, String cartaoccv, Double saldo) {
              this.id = id;
              this.numerocartao = numerocartao;
              this.nomecartao = nomecartao;
              this.datacartao = datacartao;
              this.cartaoccv = cartaoccv;
              this.saldo = saldo;
       }

       public Integer getId() {
              return id;
       }

       public void setId(Integer id) {
              this.id = id;
       }

       public String getNumerocartao() {
              return numerocartao;
       }

       public void setNumerocartao(String numerocartao) {
              this.numerocartao = numerocartao;
       }

       public String getNomecartao() {
              return nomecartao;
       }

       public void setNomecartao(String nomecartao) {
              this.nomecartao = nomecartao;
       }

       public String getDatacartao() {
              return datacartao;
       }

       public void setDatacartao(String datacartao) {
              this.datacartao = datacartao;
       }

       public String getCartaoccv() {
              return cartaoccv;
       }

       public void setCartaoccv(String cartaoccv) {
              this.cartaoccv = cartaoccv;
       }

       public Double getSaldo() {
              return saldo;
       }

       public void setSaldo(Double saldo) {
              this.saldo = saldo;
       }


       @Override
       public String toString() {
              return "Recargacartao{" +
                      "id=" + id +
                      ", numerocartao='" + numerocartao + '\'' +
                      ", nomecartao='" + nomecartao + '\'' +
                      ", datacartao='" + datacartao + '\'' +
                      ", cartaoccv='" + cartaoccv + '\'' +
                      ", saldo=" + saldo +
                      '}';
       }
}
