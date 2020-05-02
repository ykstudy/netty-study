package cn.ykstudy.persistence.device;

import cn.ykstudy.persistence.Dao;
import cn.ykstudy.persistence.domain.Device;


/**
 * @author james mu
 * @date 18-12-25 下午4:41
 */
public interface DeviceDao extends Dao<Device> {

    /**
     * Save or update device object
     *
     * @param device the device object
     * @return saved device object
     */
    Device save(Device device);

}
