package esercizio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
	
//creo dei oggetti prodotti!
	static	libri l1= new libri("boh1","harryp",23,300,"tizio","giallo");
	static libri l2=new libri("boh1","hafgp",23,300,"tizio","giallo");
	static	libri l3=new libri("boh1","harrip",23,300,"tizio","giallo");
	static	libri l4=new libri("boh1","harrydfgp",23,300,"tizio","giallo");

//	static riviste r1= new riviste("boh1","boh1",23,40,);	
//	static riviste r2= new riviste("boh1","boh2",23,40,);	
//	static riviste r3= new riviste("boh1","boh3",23,4,);	
//	static riviste r4= new riviste("boh1","boh4",23,40,);	
//	
	//creo un catalogo finto!
	List <libri> arrlibri= new ArrayList();
	
	List <riviste> arrriviste= new ArrayList();
	

	
//	aggiungielementolibro();
//	aggiungielementorivista();
	
	

	
	
	public void aggiuntaElementolibro() {
	
	arrlibri.add(l1);
	arrlibri.add(l2);
	arrlibri.add(l3);
	arrlibri.add(l4);
		;
	}
	public void aggiuntaElementorivista() {
//		arrriviste.add(r1);
//	arrriviste.add(r2);
//	arrriviste.add(r3);
//	arrriviste.add(r4);
	}
	
	
	public void aggiungiElementoLibro(libri elemento) {
		arrlibri.add(elemento);
	}
	
	public void aggiungiElementoRivista(riviste elemento) {
		arrriviste.add(elemento);
	}
private List<ElementoBiblioteca> elementiCatalogo;
	
	public main(ElementoBiblioteca elemento) {
		elementiCatalogo = new ArrayList<>();
	}
	
	public void rimuoviElemento(String codiceISBN) {
		elementiCatalogo.removeIf(elemento -> elemento.getCodiceISBN().equals(codiceISBN));
	} 

	
	public List<libri> ricercaPerAutore(String autore) {
		return elementiCatalogo.stream()
			.filter(elemento -> elemento instanceof libri)
			.map(elemento -> (libri) elemento)
				.filter(libri -> libri.getAutore().equals(autore)).toList();
	}
	
	public List<ElementoBiblioteca> ricercaPerAnno(int annoPubblicazione) {
		return elementiCatalogo.stream().filter(elemento -> elemento.getAnnoPubblicazione() == annoPubblicazione).toList();
	}
	public Optional<ElementoBiblioteca> ricercaPerCodice(String codiceISBN) {
		return elementiCatalogo.stream().filter(elemento -> elemento.getCodiceISBN().equals(codiceISBN)).findFirst();
	}
//	public void rimuoviElementolibro(int codiceibs) {
//		arrlibri.removeIf(libri -> libri.getCodiceISBN() == codiceISBN));
//	}
	
	
	}
	
