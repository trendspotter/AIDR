
package qa.qcri.aidr.analysis.facade;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import org.hibernate.Session;

import qa.qcri.aidr.analysis.entity.TagData;
import qa.qcri.aidr.analysis.entity.TagDataPK;
import qa.qcri.aidr.common.values.ReturnCode;
/**
 * Interface for operations on the tag_data table
 */

@Local
public interface TagDataStatisticsResourceFacade {
	public EntityManager getEntityManager();
	public int setEntityManager(EntityManager em);
	public Session getCurrentSession();
	
	public ReturnCode writeData(TagData tagData);
	
	public List<TagData> getDataByCrisis(String crisisCode);
	
	public TagData getSingleDataByPK(TagDataPK tagDataPK);
	
	public List<TagData> getDataByCrisisAttributeLabel(String crisisCode, String attributeCode, String labelCode);
	
	public List<TagData> getDataByCrisisAttributeLabelGranularity(String crisisCode, String attributeCode, String labelCode, Long granularity);
	
	public List<TagData> getDataByGranularityInTimeWindow(String crisisCode, String attributeCode, String labelCode, Long timestamp, Long granularity);
	
	public List<TagData> getDataAfterTimestamp(String crisisCode, String attributeCode, String labelCode, Long timestamp);
	
	public List<TagData> getDataAfterTimestampGranularity(String crisisCode, String attributeCode, String labelCode, 
														Long timestamp, Long granularity);
	
	public List<TagData> getDataBeforeTimestamp(String crisisCode, String attributeCode, String labelCode, Long timestamp);
	
	public List<TagData> getDataBeforeTimestampGranularity(String crisisCode, String attributeCode, String labelCode, 
														Long timestamp, Long granularity);
	
	
	public List<TagData> getDataInInterval(String crisisCode, String attributeCode, String labelCode, 
														Long timestamp1, Long timestamp2);
	
	public List<TagData> getDataInIntervalWithGranularity(String crisisCode, String attributeCode, String labelCode, 
			  											Long timestamp1, Long timestamp2, Long granularity);
	
	public List<String> getAttributesForCrisis(String crisisCode);
	
	public List<TagData> getDataByCrisisGranularity(String crisisCode, Long timestamp, Long granularity);
	public Map<String, Long> getTagCountByCrisisGranularity(String crisisCode, Long timestamp);
	public List<Long> getGranularitiesForCrisis(String crisisCode);
}
