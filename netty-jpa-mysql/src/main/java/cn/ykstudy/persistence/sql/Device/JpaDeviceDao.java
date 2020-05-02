package cn.ykstudy.persistence.sql.Device;

import cn.ykstudy.persistence.device.DeviceDao;

import cn.ykstudy.persistence.domain.Device;
import cn.ykstudy.persistence.entity.sql.DeviceEntity;
import cn.ykstudy.persistence.sql.JpaAbstractDao;
import cn.ykstudy.persistence.util.SqlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
@SqlDao
public class JpaDeviceDao extends JpaAbstractDao<DeviceEntity, Device> implements DeviceDao {

    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    protected Class<DeviceEntity> getEntityClass() {
        return DeviceEntity.class;
    }

    @Override
    protected CrudRepository<DeviceEntity, Long> getCrudRepository() {
        return deviceRepository;
    }



}
