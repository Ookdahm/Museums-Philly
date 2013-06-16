 package com.androidsfuture.museumsphilly;

import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class MapsMansion<PointLocation> extends MapActivity {
    /** Called when the activity is first created. */
	List<Overlay> mapOverlays;
	Drawable drawable;
	MuseumItemizedOverlay itemizedOverlay;
	Context mContext;
	MapView mapView;
	MyLocationOverlay me=null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);

        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        
        mapOverlays = mapView.getOverlays();
        drawable = this.getResources().getDrawable(R.drawable.museum_48);
        itemizedOverlay = new MuseumItemizedOverlay(drawable);
        
        me=new MyLocationOverlay(this, mapView);
        
        me.runOnFirstFix(new Runnable() { public void run() {
            mapView.getController().animateTo(me.getMyLocation());
        }});
        
    	mapView.getOverlays().add(me);
        
        
    	GeoPoint point08 = new GeoPoint((int) (39.96163*1E6), (int) (-75.1498108*1E6));
        OverlayItem overlayitem08 = new OverlayItem(point08, 
        		"Edgar Allan Poe Historic Site", "532 N. 7th Street, Philadelphia, PA");
        
        GeoPoint point20 = new GeoPoint((int) (39.952685*1E6), (int) (-75.142441*1E6));
        OverlayItem overlayitem20 = new OverlayItem(point20, 
        		"Elfreth's Alley", "126 Elfreth’s Alley, Philadelphia, PA 19106");
        
        GeoPoint point26 = new GeoPoint((int) (39.9850167*1E6), (int) (-75.2162246*1E6));
        OverlayItem overlayitem26 = new OverlayItem(point26, 
        		"Shofusos Japanese House and Garden", "4700 States Drive, Philadelphia, PA 19131");
        
        GeoPoint point28 = new GeoPoint((int) (40.0529826*1E6), (int) (-74.9827232*1E6));
        OverlayItem overlayitem28 = new OverlayItem(point28, 
        		"Glen Foerd on the Delaware", "5001 Grant Avenue, Philadelphia, PA. 19114");
        
        GeoPoint point38 = new GeoPoint((int) (39.948799*1E6), (int) (-75.14745*1E6));
        OverlayItem overlayitem38 = new OverlayItem(point38, 
        		"Carpenters' Hall", "320 Chestnut Street, Philadelphia, PA 19106");
        
        GeoPoint point40 = new GeoPoint((int) (40.046608*1E6), (int) (-75.1819529*1E6));
        OverlayItem overlayitem40 = new OverlayItem(point40, 
        		"Cliveden of the National Trust", "6401 Germantown Avenue, Philadelphia, PA 19144");
        
        GeoPoint point42 = new GeoPoint((int) (40.038238*1E6), (int) (-75.183637*1E6));
        OverlayItem overlayitem42 = new OverlayItem(point42, 
        		"Ebenezer Maxwell Mansion", "200 West Tulpehocken Street, Philadelphia, PA");
        
        GeoPoint point43 = new GeoPoint((int) (40.0299461*1E6), (int) (-75.1895398*1E6));
        OverlayItem overlayitem43 = new OverlayItem(point43, 
        		"Historic RittenhouseTown", "206 Lincoln Drive, Philadelphia, PA 19144");
        
        GeoPoint point44 = new GeoPoint((int) (40.0434249*1E6), (int) (-75.1810678*1E6));
        OverlayItem overlayitem44 = new OverlayItem(point44, 
        		"The Johnson House", "6306 Germantown Avenue, Philadelphia, PA 19144");
        
        GeoPoint point45 = new GeoPoint((int) (39.972808*1E6), (int) (-75.186777*1E6));
        OverlayItem overlayitem45 = new OverlayItem(point45, 
        		"Lemon Hill Mansion", "Sedgeley & Lemon Hill Drives , East Fairmount Park, Philadelphia, PA 19130");
        
        GeoPoint point49 = new GeoPoint((int) (40.0238171*1E6), (int) (-75.1545658*1E6));
        OverlayItem overlayitem49 = new OverlayItem(point49, 
        		"Stenton", "4601 N 18th Street, Philadelphia, PA 19140");
        
        GeoPoint point50 = new GeoPoint((int) (39.9944578*1E6), (int) (-75.1918948*1E6));
        OverlayItem overlayitem50 = new OverlayItem(point50, 
        		"Strawberry Mansion House", "2450 Strawberry Mansion Drive., Philadelphia, PA  19132");
        
        GeoPoint point51 = new GeoPoint((int) (40.6903303*1E6), (int) (-73.9896472*1E6));
        OverlayItem overlayitem51 = new OverlayItem(point51, 
        		"Sweetbriar Mansion", "1 Sweetbriar Lane, Fairmount Park West, Philadelphia, PA 19131-3792");
        
        GeoPoint point52 = new GeoPoint((int) (39.9765889*1E6), (int) (-75.2007472*1E6));
        OverlayItem overlayitem52 = new OverlayItem(point52, 
        		"Woodford Mansion", "33rd & Dauphin Streets, East Fairmount Park, Philadelphia, PA 19132");
        
        GeoPoint point53 = new GeoPoint((int) (40.039806*1E6), (int) (-75.178647*1E6));
        OverlayItem overlayitem53 = new OverlayItem(point53, 
        		"Wyck Historic House", "6026 Germantown Ave., Philadelphia, PA 19144");
        
        
        
        itemizedOverlay.addOverlay(overlayitem08);
        itemizedOverlay.addOverlay(overlayitem20);
        itemizedOverlay.addOverlay(overlayitem26);
        itemizedOverlay.addOverlay(overlayitem28);
        itemizedOverlay.addOverlay(overlayitem38);
        itemizedOverlay.addOverlay(overlayitem40);
        itemizedOverlay.addOverlay(overlayitem42);
        itemizedOverlay.addOverlay(overlayitem43);
        itemizedOverlay.addOverlay(overlayitem44);
        itemizedOverlay.addOverlay(overlayitem45);
        itemizedOverlay.addOverlay(overlayitem49);
        itemizedOverlay.addOverlay(overlayitem50);
        itemizedOverlay.addOverlay(overlayitem51);
        itemizedOverlay.addOverlay(overlayitem52);
        itemizedOverlay.addOverlay(overlayitem53);
                
        
        mapOverlays.add(itemizedOverlay);
        
		MapController mapControl = mapView.getController();
        mapControl.setCenter(itemizedOverlay.getCenter());
        mapControl.zoomToSpan(itemizedOverlay.getLatSpanE6(), itemizedOverlay.getLonSpanE6());
    }
    
    @Override
	public void onResume() {
		super.onResume();
		me.enableMyLocation();
		me.enableCompass();
	}		

	@Override
	public void onPause() {
		super.onPause();
		me.disableMyLocation();
		me.disableCompass();
	}
    

    protected boolean isRouteDisplayed() {
        return false;
    }
	    
	    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_menu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        
        case R.id.Sat_View:
        	mapView.setSatellite(true);
            mapView.setStreetView(true);
            return true;
            
        case R.id.Map_View:
        	mapView.setSatellite(false);
            mapView.setStreetView(false);
            return true;
        
        case R.id.Map_Menu_All:
        	
    		startActivity(new Intent(this, Maps.class));
    		Toast.makeText(this, R.string.toast_all, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Free:
    		
    		startActivity(new Intent(this, MapsFree.class));
    		Toast.makeText(this, R.string.toast_free, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Art:
    		
    		startActivity(new Intent(this, MapsArt.class));
    		Toast.makeText(this, R.string.toast_art, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Mansion:
    		
    		startActivity(new Intent(this, MapsMansion.class));
    		Toast.makeText(this, R.string.toast_mansion, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_History:
    	
    		startActivity(new Intent(this, MapsHistory.class));
    		Toast.makeText(this, R.string.toast_history, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Science:
    	
    		startActivity(new Intent(this, MapsScience.class));
    		Toast.makeText(this, R.string.toast_science, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    		
        default:
            return super.onOptionsItemSelected(item);
        }
    }   
	    
	    
    public class MuseumItemizedOverlay extends ItemizedOverlay {

    	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
    	
    	public MuseumItemizedOverlay(Drawable defaultMarker) {
    		super(boundCenterBottom(defaultMarker));
    		
    		// TODO Auto-generated constructor stub
    	}
    	
    	public void addOverlay(OverlayItem overlay) {
    	    mOverlays.add(overlay);
    	    populate();
    	}

    	@Override
    	protected OverlayItem createItem(int i) {
    		// TODO Auto-generated method stub
    		return mOverlays.get(i);
    	}

    	@Override
    	public int size() {
    		// TODO Auto-generated method stub
    		return mOverlays.size();
    	}
    	
    	@Override
    	protected boolean onTap(int index) {
    	
    	
    	  final OverlayItem item = mOverlays.get(index);
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsMansion.this);
    	  dialog.setTitle(item.getTitle());
    	  dialog.setMessage(item.getSnippet());
    	  
    	  dialog.setNegativeButton("Navigate", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("google.navigation:q=" + item.getSnippet())));
				
			}
		});
    	  
    	  dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				dialog.cancel();
				
			}
		});
    	  dialog.show();
    	 
    	  return true;
    	}

    }

}