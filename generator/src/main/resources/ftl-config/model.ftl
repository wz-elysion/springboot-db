package ${package};

import javax.persistence.*;
import lombok.Data;
import java.util.Date;

/**
 * 通用 Mapper 代码生成器
 *
 * @author mapper-generator
 */
@Data
@Table(name = "`${tableClass.tableName}`")
public class ${tableClass.shortClassName}Po {
<#if tableClass.allFields??>
  <#list tableClass.allFields as field>

    <#if (field.remarks?length > 0)>
  /**
   * ${field.remarks}
   */
    </#if>
    <#if field.identity>
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    </#if>
  @Column(name = "`${field.columnName}`")
  private ${field.shortTypeName} ${field.fieldName};
  </#list>
</#if>
}




