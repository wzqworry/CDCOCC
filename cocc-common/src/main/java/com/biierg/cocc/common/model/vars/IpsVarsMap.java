/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.vars;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ips变量列表
 *
 * @author wen.ding
 */
@XmlRootElement(name = "root")
public class IpsVarsMap implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<IpsVarConfig> ipsVarList = new ArrayList<>();

    /**
     * @return the ipsVarList
     */
    @XmlElementWrapper
    @XmlElement(name = "var")
    public List<IpsVarConfig> getIpsVarList() {
        return ipsVarList;
    }

    /**
     * @param ipsVarList
     */
    public void setIpsVarList(List<IpsVarConfig> ipsVarList) {
        this.ipsVarList = ipsVarList;
    }
}
