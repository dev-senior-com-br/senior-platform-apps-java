package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Ordenação
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    /**
     * Nome do schema
     */
    public String schema;
    /**
     * Nome da tabela
     */
    public String table;
    /**
     * Coluna em que será aplicado o filtro
     */
    public String column;
    /**
     * Função aplicada
     */
    public FunctionType function;
    /**
     * Ordem
     */
    public OrderType order;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param schema - Nome do schema
     * @param table - Nome da tabela
     * @param column - Coluna em que será aplicado o filtro
     * @param order - Ordem
     * 
     */
    public Order(String schema, String table, String column, OrderType order) {
        this.schema = schema;
        this.table = table;
        this.column = column;
        this.order = order;
    }

}
