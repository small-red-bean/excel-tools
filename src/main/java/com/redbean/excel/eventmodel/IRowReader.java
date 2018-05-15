package com.redbean.excel.eventmodel;

import java.util.List;

public interface IRowReader {
	void row(int sheetIndex, int rowIndex, List<String> rowData);
}
