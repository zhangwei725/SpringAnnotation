package com.werner.di.dao;

import java.util.List;

/**
 * ┌─┐       ┌─┐ + +
 * ┌──┘ ┴───────┘ ┴──┐++
 * │                 │
 * │       ───       │++ + + +
 * ███████───███████ │+
 * │                 │+
 * │       ─┴─       │
 * │                 │
 * └───┐         ┌───┘
 * │         │
 * │         │   + +
 * │         │
 * │         └──────────────┐
 * │                        │
 * │                        ├─┐
 * │                        ┌─┘
 * │                        │
 * └─┐  ┐  ┌───────┬──┐  ┌──┘  + + + +
 * │ ─┤ ─┤       │ ─┤ ─┤
 * └──┴──┘       └──┴──┘  + + + +
 * 神兽保佑
 * 代码无BUG!
 * <p>
 * <p>
 * 封装 共性
 */
public interface BaseDao<T> {
    /**
     * 保存单个对象
     *
     * @param t
     * @return
     */
     int save(T t);

    /**
     * 保存多个对象
     *
     * @param datas
     * @return
     */
     int saveList(List<T> datas);
}
