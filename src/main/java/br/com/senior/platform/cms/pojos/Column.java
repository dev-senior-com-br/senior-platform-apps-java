package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Representa uma coluna da projeção
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Column {

    /**
     * Nome do schema
     */
    private String schema;
    /**
     * Nome da tabela
     */
    private String table;
    /**
     * Nome da coluna
     */
    private String column;
    /**
     * Label da coluna
     */
    private String label;
    /**
     * Informa uma função aplicada na coluna
     */
    private FunctionType function;
    /**
     * Precisão para formatação do valor
     */
    private Long precision;
    /**
     * Prefixo do label
     */
    private String prefix;
    /**
     * Sufixo do label
     */
    private String sufix;
    /**
     * Máscara da coluna
     */
    private String mask;
    /**
     * Campo que identifica a latitude da localização a ser renderizada no gráfico de tipo mapa
     */
    private Column latitude;
    /**
     * Campo que identifica a longitude da localização a ser renderizada no gráfico de tipo mapa
     */
    private Column longitude;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param schema - Nome do schema
     * @param table - Nome da tabela
     * @param column - Nome da coluna
     * 
     */
    public Column(String schema, String table, String column) {
        this.schema = schema;
        this.table = table;
        this.column = column;
    }

}
