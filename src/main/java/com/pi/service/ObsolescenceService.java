package com.pi.service;

import java.util.List;

import com.pi.model.Obsolescence;
import com.pi.model.StoreProcess;
import com.pi.util.InvalidStoreNumber;

public interface ObsolescenceService {
	public String createObsolence(Obsolescence obs);

	public List<Obsolescence> getAllObsolence();

	public void deleteObsolence(Obsolescence obsolence);

	public void obsFileUploadForProcess(List<String> sheetData,
			List<Obsolescence> invData) throws InvalidStoreNumber;

}
