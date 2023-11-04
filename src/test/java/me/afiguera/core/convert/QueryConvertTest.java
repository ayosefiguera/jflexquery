package me.afiguera.core.convert;

import org.junit.jupiter.api.Test;

public class QueryConvertTest {
    final String basicQuery = "SELECT DISTINCT {p.pk} FROM {Product AS p}";
    final String basicWithWhere = "SELECT DISTINCT {p.pk} " +
            "FROM {Product AS p} " +
            "WHERE {p.enrichmentPartner} = 8796124414043";
    final String queryWithJoin = "SELECT DISTINCT {p.pk} " +
            "FROM {Product AS p \n" +
            "JOIN CatalogVersion AS v ON {p.catalogVersion} = {v.pk} \n" +
            "JOIN SPAEntry AS se ON {se.uniqueIdentifier} = {p.code}\n" +
            "JOIN SPA AS spa ON {spa.pk}={se.spa}} \n" +
            "WHERE {p.enrichmentPartner} = 8796124414043 \n" +
            "AND {v.enableEnrichmentRequest} = 1 ";
    final String queryWithSubQuery = "SELECT Distinct {vp.PK}\n" +
            "FROM {DisplayVariantProduct as vp\n" +
            "JOIN CatalogVersion AS v on {vp.CATALOGVERSION} = {v.PK}\n" +
            "JOIN PRODUCT as p on {vp.PARENTPRODUCT} = {p.PK}\n" +
            "LEFT JOIN SPAEntry AS se ON {se.uniqueIdentifier} = {vp.code}\n" +
            "LEFT JOIN SPA AS spa ON {spa.pk}={se.spa}}\n" +
            "WHERE ({v.ENABLEENRICHMENTREQUEST} = 1\n" +
            "AND {vp.enhancementStatus} IN (8796118876251,8796131491931,8796118909019,8796118941787,8796119007323,8796119072859,8796119105627,8796119138395)\n" +
            "AND {vp.enrichmentPartner} = 8796124414043 \n" +
            "AND {vp.SPASENT} = 0)\n" +
            "AND ({vp.code} = {se.uniqueIdentifier} \n" +
            "or EXISTS ( {{ \n" +
            "            SELECT DISTINCT {p.pk} \n" +
            "\t\t\tFROM {Product AS p \n" +
            "\t\t\tJOIN CatalogVersion AS v ON {p.catalogVersion} = {v.pk}\n" +
            "         \tJOIN SPAEntry AS se ON {se.uniqueIdentifier} = {p.code}\n" +
            "\t\t\tJOIN SPA AS spa ON {spa.pk}={se.spa}} \n" +
            "\t\t\tWHERE {p.enhancementStatus} \n" +
            "            IN (8796118876251,8796131491931,8796118909019,8796118941787,8796119007323,8796119072859,8796119105627,8796119138395)\n" +
            "\t\t\tAND {p.enrichmentPartner} = 8796124414043 \n" +
            "\t\t\tAND {v.enableEnrichmentRequest} = 1  }}) \n" +
            "    )";

    @Test
    public void basicQueryWithoutWhereToJavaCode() {

    }

    @Test
    public void queryWithWhereToJavaCode() {

    }

    @Test
    public void queryWithJoinToJavaCode() {

    }

    @Test
    public void queryWithSubQuery() {

    }

}
