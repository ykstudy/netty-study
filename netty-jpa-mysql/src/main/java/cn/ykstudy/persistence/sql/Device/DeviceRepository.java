package cn.ykstudy.persistence.sql.Device;

import cn.ykstudy.persistence.util.SqlDao;
import cn.ykstudy.persistence.entity.sql.DeviceEntity;
import org.springframework.data.repository.CrudRepository;

@SqlDao
public interface DeviceRepository extends CrudRepository<DeviceEntity,Long> {

}
