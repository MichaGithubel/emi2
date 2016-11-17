package de.davidgollasch.emiexercise2;


import android.content.Intent;

/**
 * Created by Michael on 17.11.2016.
 */

public class  kontakte implements java.io.Serializable {

    public String title;
    public String vorname;
    public String nachname;
    public String straße;
    public String stadt;
    public String land;
    public String plz;

    public static void main(String[] args) {

        kontakte Meyer = new kontakte();
        kontakte Stramm = new kontakte();
        kontakte Wennige = new kontakte();
        kontakte Beckmann = new kontakte();
        kontakte Watson = new kontakte();
        Meyer.title = "Herr";
        Meyer.vorname="Robert";
        Meyer.nachname="Meyer";
        Meyer.straße="Apfelbergstraße 10";
        Meyer.stadt="St.Margrethen";
        Meyer.land="Schweiz";
        Meyer.plz="9430";
        Stramm.title = "Frau";
        Stramm.vorname="Elisabeth";
        Stramm.nachname="Stramm";
        Stramm.straße="Fritz-Konzert-Straße 1a";
        Stramm.stadt="Innsbruck";
        Stramm.land="Österreich";
        Stramm.plz="6020";
        Wennige.title = "Herr";
        Wennige.vorname="Stefan";
        Wennige.nachname="Wemmoge";
        Wennige.straße="Kirchplatz 13";
        Wennige.stadt="Wattens";
        Wennige.land="Österreich";
        Wennige.plz="6112";
        Beckmann.title = "Frau";
        Beckmann.vorname="Ella";
        Beckmann.nachname="Beckmann";
        Beckmann.straße="Falkenstraße 3";
        Beckmann.stadt="Dresden";
        Beckmann.land="Deutschland";
        Beckmann.plz="01067";
        Watson.title = "Frau";
        Watson.vorname="Emma";
        Watson.nachname="Watson";
        Watson.straße="1 Langdon Park Rd";
        Watson.stadt="London";
        Watson.land="Vereinigtes Königreich";
        Watson.plz="N6 5PS";

    }





}
