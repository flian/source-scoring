package com.hpe.g11n.sourcescoring.core;




import com.hpe.g11n.sourcescoring.pojo.ReportData;

import java.util.List;

public interface IRule {
	boolean check(String source, String target);
	List<ReportData> gatherReport();
}
