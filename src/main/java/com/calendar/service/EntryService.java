package com.calendar.service;

import java.util.ArrayList;

import com.calendar.requestdto.EntryDto;
import com.calendar.requestdto.ProjectDto;
import com.calendar.responsedto.EntryListResponseDto;
import com.calendar.responsedto.EntryResponseDto;
import com.calendar.responsedto.FullProjectResponseDto;
import com.calendar.responsedto.ProjektEntriesResponseDto;

public interface EntryService {

	public void createEntry(EntryDto entryDto);
	
	public void createProject(ProjectDto projectDto);
	
	public ArrayList<ProjektEntriesResponseDto> getProjekts(boolean isFinished);
	
	public EntryListResponseDto getEntries();
	
	public EntryResponseDto getEntryById(int id);
	
	public FullProjectResponseDto getFullProjectById(int id);
	
	public void deleteEntryById(int id);
}
