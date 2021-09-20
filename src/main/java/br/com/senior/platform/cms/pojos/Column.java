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
    public String schema;
    /**
     * Nome da tabela
     */
    public String table;
    /**
     * Nome da coluna
     */
    public String column;
    /**
     * Label da coluna
     */
    public String label;
    /**
     * Informa uma função aplicada na coluna
     */
    public FunctionType function;
    /**
     * Precisão para formatação do valor
     */
    public Long precision;
    /**
     * Prefixo do label
     */
    public String prefix;
    /**
     * Sufixo do label
     */
    public String sufix;
    /**
     * Máscara da coluna
     */
    public String mask;
    /**
     * Campo que identifica a latitude da localização a ser renderizada no gráfico de tipo mapa
     */
    public Column latitude;
    /**
     * Campo que identifica a longitude da localização a ser renderizada no gráfico de tipo mapa
     */
    public Column longitude;

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
