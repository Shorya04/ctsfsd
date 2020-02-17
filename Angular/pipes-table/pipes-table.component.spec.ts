import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PipesTableComponent } from './pipes-table.component';

describe('PipesTableComponent', () => {
  let component: PipesTableComponent;
  let fixture: ComponentFixture<PipesTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PipesTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PipesTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
