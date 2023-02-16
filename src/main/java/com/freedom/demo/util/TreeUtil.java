package com.freedom.demo.util;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Description: 树工具类
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/14 16:47
 */
public class TreeUtil {
    /**
     * 根据对象构建树
     * 对象必须包含三个参数,id,parentId,children(对象集合)
     * 使用方式  TreeUtil.buildTree(customerOrgVoList,
     *                 CustomerOrgVo::getId, CustomerOrgVo::getParentId, CustomerOrgVo::setChildren)
     */
    public static <T> List<T> buildTree(List<T> list, Function<T, ?> getId, Function<T, ?> getParentId, BiConsumer<T, List<T>> setChildren) {
        List<Object> idList = new ArrayList<>();
        Map<Object, List<T>> childrenMap = new HashMap<>();
        for (T item : list) {
            Object parentId = getParentId.apply(item);
            if (Objects.isNull(parentId)) {
                parentId = "";
            }
            childrenMap.computeIfAbsent(parentId, (k) -> new ArrayList<>()).add(item);
            Object id = getId.apply(item);
            setChildren.accept(item, childrenMap.computeIfAbsent(id, (k) -> new ArrayList<>()));
            idList.add(id);
        }
        return list.stream().filter((itemx) -> !idList.contains(getParentId.apply(itemx))).collect(Collectors.toList());
    }
}
